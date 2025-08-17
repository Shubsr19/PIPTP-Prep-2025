class UserMainCode(object):
    @classmethod
    def isPalinNum(cls, input1):
        original = input1
        reverse_num = 0
        while input1 > 0:
            reverse_num = reverse_num * 10 + (input1 % 10)
            input1 //= 10
        
        return 2 if reverse_num == original else 1
