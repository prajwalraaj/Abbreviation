def abbrivation(statement):
    lst=statement.split()
    output=""
    for word in lst:
        output+=word[0]
    output=output.upper()
    return output
statement=str(input("Enter the statement:"))
class sol:
    def solve(self,s):
        rp=s[0]
        ans=s[0]
        for i in s[1:]:
            if i!=rp:
                ans+=i
                rp=i
        return ans
ob=sol()
print(ob.solve(abbrivation(statement)))
