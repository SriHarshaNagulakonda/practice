import json

input='''

[
{
"id":"001",
"x":"1"
},
{
"id":"002",
"x":"2"
}]

'''

info=json.loads(input)
for i in info:
    print(i)
