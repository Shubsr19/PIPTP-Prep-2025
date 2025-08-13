class UserMainCode(object):
    @classmethod
    def addNumberStrings(cls, input1, input2):
        i, j = len(input1) - 1, len(input2) - 1
        carry = 0
        result = []

        while i >= 0 or j >= 0 or carry:
            digit1 = int(input1[i]) if i >= 0 else 0
            digit2 = int(input2[j]) if j >= 0 else 0

            total = digit1 + digit2 + carry
            result.append(str(total % 10))  
            carry = total // 10  

            i -= 1
            j -= 1

        return ''.join(result[::-1])
