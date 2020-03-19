class Tree:
    '''def __str__(self):
        return str(self.value)
    '''
    def __init__(self, x=None):
        if x:
            self.value = x
            self.left = Tree()
            self.right = Tree()
            self.parent = None
        else:
            self.value = None
            self.left = None
            self.right = None
            self.parent = None

    def find(self, x):
        if self.value != None:
            if self.value == x.value:
                return True
            elif self.value > x.value:
                return self.left.find(x)
            else:
                return self.right.find(x)
        return False

    def search(self, x):
        t = Tree(x)
        return self.find(t)

    def min(self):
        if self.left.value == None:
            return self.value
        return self.left.min()

    def max(self):
        if self.right.value == None:
            return self.value
        return self.right.max()
    def get_Node(self,x):
        if self.value:
            if self.value == x.value:
                return self
            elif self.value > x.value:
                return self.left.get_Node(x)
            else:
                return self.right.get_Node(x)
        return "hii"
    def succ(self,x):
        try:
            x = self.get_Node(Tree(x))
            if x.value!=None and x.right.value!=None:
                return x.right.min()
            else:
                y=x.parent
                while(y!=None and x==y.right):
                    x=y
                    y=y.parent
                return y.value
        except:
            return None

    def pred(self,x):
        try:
            x = self.get_Node(Tree(x))
            if x.value!=None and x.left.value!=None:
                return x.left.max()
            else:
                y=x.parent
                while(y!=None and x==y.left):
                    x=y
                    y=y.parent
                return y.value
        except:
            return None


    def insert(self, x):
        if self.value == None:
            self.value = x
            self.left = Tree()
            self.right = Tree()
            self.left.parent = self
            self.right.parent = self
        else:
            if self.value > x:
                self.left.insert(x)
                self.left.parent=self
            else:
                self.right.insert(x)
                self.right.parent=self

    def delete(self,x):
        try:
            x=self.get_Node(Tree(x))
            if(x.left.value==None and x.right.value==None):
                y=x.parent
                if(y.left==x):
                    y.left=Tree()
                else:
                    y.right=Tree()
                return x.value
            if(x.left.value!=None and x.right.value==None):
                y=x.parent
                if(y.left==x):
                    y.left=x.left
                else:
                    y.right=x.left
                return x.right.value
            elif(x.left.value==None and x.right.value!=None):
                y=x.parent
                if(y.left==x):
                    y.left=x.right
                else:
                    y.left=x.right
                return x.right.value
            else:
                p=self.pred(x)
                print(p)
                '''x=self.get_Node(Tree(x))
                x.value=p
                x.left.get_Node(Tree(p)).delete(p)'''
        except:
            return None

    def inorder(self):
        if self.value:
            return self.left.inorder() + [self] + self.right.inorder()
        return []

    def preorder(self):
        if self.value:
            return [self.value] + self.left.preorder() + self.right.preorder()
        return []

    def postorder(self):
        if self.value:
            return self.left.postorder() + self.right.postorder() + [self.value]
        return []

a = Tree(5)
a.insert(3)
a.insert(2)
a.insert(4)
a.insert(8)
a.insert(6)
a.insert(7)
a.insert(1)
a.insert(9)
for i in a.inorder():
    print(i.value,'-',i.parent,end=',')
print(list(map(lambda x: x.value,a.inorder())))
print("Pre Order",a.preorder())
print("Post Order",a.postorder())
print("Search",a.search(2))
print("Min",a.min())
print("Max",a.max())
print("Succ",a.succ(4))
print("Pred",a.pred(8))
print("Del",a.delete(4))
print("Pre Order",a.preorder())
print("Del",a.delete(8))
print("Pre Order",a.preorder())
