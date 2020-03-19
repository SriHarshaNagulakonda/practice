from flask import Flask, render_template, request, session
from flask_session import Session
app=Flask(__name__)

app.config["SESSION_PERMANENT"]=False
app.config["SESSION_TYPE"]="filesystem"
Session(app)

notes=[]
@app.route("/<string:name>/name")
def name(name):
    return "helo "+name

@app.route('/')
def index():
    if session.get("notes") is None:
        session["notes"]=[]
    session["notes"]=["hii"]
    return render_template("index.html")

@app.route('/more')
def more():
    name=session["name"]
    return render_template('more.html')

@app.route('/hello',methods=["GET","POST"])
def hello():
    if request.method=="GET":
        return "Dengey to Submit Form"
    else:
        name=request.form.get("name")
        session["name"]=name
        return "Hello   "+name

