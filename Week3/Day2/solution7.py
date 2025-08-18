class UserMainCode(object):
    @classmethod
    def weightOfString(cls, input1: str) -> int:
        weight = 0
        for ch in input1.lower():  
            if 'a' <= ch <= 'z':   
                weight += (ord(ch) - ord('a') + 1)
        return weight
