def free(i,j,board):
    if board['row'][i]==board['col'][j]==board['ntos'][j-i+n]==board['ston'][j+i]==0:
        return True
    return False
def fit(i,board):
    for j in range(n):
        if free(i,j,board):
            board['row'][i]=1
            board['col'][j]=1
            board['ntos'][j-i+n]=1
            board['ston'][j+i]=1
            board['val'][i]=j
            if q-1==i:
                return True
            else:
                x=fit(i+1,board)
            if x:
                return True
            else:
                board['row'][i]=0
                board['col'][j]=0
                board['ntos'][j-i+n]=0
                board['ston'][j+i]=0
                board['val'][i]=-1
    else:
        return False
n=int(input("Enter Chess Board Size"))
q=int(input("Enter no. of queens "))
board={'row':[0]*n,'col':[0]*n,'ntos':[0]*(2*n-1),'ston':[0]*(2*n-1),'val':[-1]*n}
try:
    if fit(0,board):
        print("True")
        for p in board['val']:
            print("-----"*n)
            for q in range(n):
                if p==q:
                    print("| Q |",end="")
                else:
                    print("|   |",end="")
            print()
        print("-----"*n)

    else:
        print("False")
except:
    print("Not Possible")
#print(board)
