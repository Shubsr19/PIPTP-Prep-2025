class UserMainCode(object):
    @classmethod
    def totalHillWeight(cls, input1, input2, input3):
        total_weight = 0
        for level in range(1, input1 + 1):
            star_weight = input2 + (level - 1) * input3
            total_weight += level * star_weight
        return total_weight
