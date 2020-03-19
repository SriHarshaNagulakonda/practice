n=int(input('Enter a number'))
print("\n".join(["-".join([chr(i) for i in range(97+j,97,-1)]+[chr(i) for i in range(97,97+j+1)]).center(4*n-3,'-') for j in list(range(n))+list(range(n-2,-1,-1))]))
    #print("-".join([chr(i) for i in range(97+j,97,-1)]+[chr(i) for i in range(97,97+j+1)]).center(4*n-3,'-'))