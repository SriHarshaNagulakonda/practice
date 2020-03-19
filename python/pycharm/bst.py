class tree:
    def __init__(self,x=None):
        if x:
            self.value=x
            self.left=tree()
            self.right=tree()
        else:
            self.value=None
            self.left=None
            self.right=None
    def insert(self,x):
        if self.value==None:
            self.value=x
            self.left=tree()
            self.right=tree()
        else:
            if self.value>x:
                self.left.insert(x)
            elif self.value<x:
                self.right.insert(x)
    def inorder(self):
        if self.left==None and self.right==None and self.value!=None:
            return [self.value]
        if self.left==None and self.right!=None and self.value!=None:
            return [self.value+self.right.inorder()]
        if self.right == None and self.left != None and self.value!=None:
            return [self.left.inorder()+self.value]
        if self.value!=None:
            return [self.left.inorder()]+[self.value]+[self.right.inorder()]
        return []
a=tree(30)
a.insert(4)
a.insert(2)
a.insert(5)
a.insert(1)
print(a.inorder())