Problem:
name = input()

def InitialsName(name):
    name = name.split(" ")
    newName = ''
    for i in range(len(name)):
        if (i == (len(name) - 1)):
            newName = newName + name[i]
        else:
            newName = newName + name[i][0] + ". "
    return newName

p = InitialsName(name)
print(p)
Example Input & Output:
Input:
Mnas Cdefgh
Output:
M. Cdefgh
Explanation:
The input string "Mnas Cdefgh" is split into ["Mnas", "Cdefgh"].

The function takes the first character of every word except the last one, adds a dot (.) and a space after each.

The last word is printed as it is.
