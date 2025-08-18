class UserMainCode(object):
    @classmethod
    def mostFrequentDigit(cls, input1: str) -> int:
        # Dictionary to count frequency
        freq = [0] * 10   

        for ch in input1:
            if ch.isdigit():
                freq[int(ch)] += 1

        max_freq = max(freq)
        
        for digit in range(9, -1, -1):
            if freq[digit] == max_freq:
                return digit
