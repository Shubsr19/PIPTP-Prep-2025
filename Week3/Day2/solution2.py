class UserMainCode(object):
    @classmethod
    def isPalinNumPossible(cls, input1):
        digits = str(input1)
        freq = {}
        
        for d in digits:
            freq[d] = freq.get(d, 0) + 1
        
        odd_count = 0
        for count in freq.values():
            if count % 2 != 0:
                odd_count += 1
        
        return 2 if odd_count <= 1 else 1
