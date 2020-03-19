class lis:
    def __init__(self,x):
        self.value=x
        self.next=None
    def ins_last(self,x):
        if self.value==None:
            self.value=x
        else:
            if self.next==None:
                self.next=lis(x)
            else:
                self=self.next
                self.ins_last(x)
    def display(self):
        while self.next!=None:
            print(self.value,end='')
            self=self.next
        print(self.value)
    def ins_first(self,x):
        if self.next==None:
            self.value=x
            self.next=None
        else:
            t = lis(x)
            t.next=self.next
            self.next=t
            self.value,t.value=t.value,self.value
    def ins_middle(self,x,i):
        if i==0:
            self.ins_first(x)
        else:
            j=0
            while j!=i-1:
                self=self.next
                j+=1
            t=lis(x)
            t.next=self.next
            self.next=t
    def del_first(self):
        self.value=self.next.value
        self.next=self.next.next
    def del_last(self):
        if self.next.next==None:
            self.next=None
        else:
            self=self.next
            self.del_last()
a=lis(3)
a.ins_last(4)
a.ins_last(5)
a.ins_first(2)
a.ins_middle(1,0)
a.ins_middle(7,3)
a.display()
a.del_first()
a.display()
a.del_last()
a.display()