class Tree:
    def __init__(self, x=None):
        if x:
            self.value = x
            self.left = Tree()
            self.right = Tree()
            self.height=1
        else:
            self.value = None
            self.left = None
            self.right = None
            self.height=0

    def ll(self):
        x=Tree(self.value)

        tlr=self.left.right
        tll=self.left.left
        tr=self.right

        self.value=self.left.value
        self.right=x
        self.left=tll
        x.left=tlr
        x.right=tr

    def rr(self):
        x = Tree(self.value)
        trl = self.right.left
        trr = self.right.right
        tl = self.left

        self.value = self.right.value
        self.left = x
        self.right= trr
        x.left = tl
        x.right = trl

    def lr(self):
        self.left.rr()
        self.ll()

    def rl(self):
        self.right.ll()
        self.rr()

    def getSlope(self):
        return self.left.height-self.right.height

    def rebalance(self):
        if self.getSlope()==2:
            if self.left.left!=None:
                self.ll()
            else:
                self.lr()
        elif self.getSlope()==-2:
            if self.right.right!=None:
                self.rr()
            else:
                self.rl()
    def insert(self,k):
        if self.value!=None:
            if self.value>k:
                if self.left.value==None:
                    self.left=Tree(k)
                    self.height=max(2,self.right.height+1)
                else:
                    self.left.insert(k)
                    self.height=max(self.left.height,self.right.height)+1
                    self.rebalance()
                    self.height=max(self.left.height,self.right.height)+1
            else:
                if self.right.value==None:
                    self.right=Tree(k)
                    self.height=max(2,self.left.height+1)
                else:
                    self.right.insert(k)
                    self.height=max(self.left.height,self.right.height)+1
                    self.rebalance()
                    self.height=max(self.left.height,self.right.height)+1

    def inorder(self):
        if self.value!=None:
            self.left.inorder()
            print(self.value,end=' ')#,"height",self.height)
            self.right.inorder()

    def levelorder(self):
        q=[self]
        while len(q)!=0:
            x=q.pop(0)
            print(x.value,x.height)
            if(x.left!=None):
                q+=[x.left]
            if(x.right!=None):
                q+=[x.right]
a = Tree(5)
a.insert(3)

a.insert(2)

a.insert(4)

a.insert(8)
a.insert(6)
'''
a.insert(9)

#a.insert(7)

a.insert(1)
a.insert(9)
'''
#a.inorder()
#print()
print("level order",end=' ')
a.levelorder()
print()
print(a.value,a.left.value,a.right.value,a.right.left.value)

