class UserMainCode(object):
    @classmethod
    def findStringCode(cls, input1):
        words = input1.split()
        result_parts = []

        for word in words:
            total = 0
            i, j = 0, len(word) - 1
            while i <= j:
                total += abs(ord(word[i]) - ord(word[j]))
                i += 1
                j -= 1
            result_parts.append(str(total))

        return int("".join(result_parts))
