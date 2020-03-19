import os
print('hello')
x="acq,alum,bop,carcass,cocoa,coffee,copper,cotton,cpi,cpu,crude,dlr,earn,fuel,gas,gnp,gold,grain,heat,housing,income,instal-debt,interest,ipi,iron-steel,jet,jobs,lead,lei,livestock,lumber,meal-feed,money-fx,money-supply,nat-gas,nickel,orange,pet-chem,platinum,potato,reserves,retail,rubber,ship,strategic-metal,sugar,tea,tin,trade,veg-oil,wpi,zinc"
f=open("srikanth sir/test.txt", "r").readlines()
c=0
#l=x.split(',')
l=["course","faculty","project","student"]
key_words={}
for i in l:
    key_words[i]=0
#key_words={"course":0,"faculty":0,"project":0,"student":0}
folder="srikanth sir/webkb/test stemmed"
os.makedirs(folder)
fp=open("trainn.txt","w")
for j in f:
    c+=1
    for i in j.split():
        #if  i=="student" or i=="project" or i=="faculty" or i=="course":
        if i in l:
            print(i)
            if key_words[i]==0:
                print(i)
                os.makedirs(folder+"/"+i)
                fp.close()
            key_words[i]+=1
            key_name=i
            key_count=key_words[i]
            fp = open(folder+"/"+key_name+"/" + key_name + str(key_count)+".txt", "a")
        else:
            fp.write(i+" ")
    #c+=1
print(c)
fp.close()
