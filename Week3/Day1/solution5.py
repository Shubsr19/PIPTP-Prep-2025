class UserMainCode(object):
    @classmethod
    def isExactMultiple(cls, N, M):
        if M == 0:
            return 1  
        return 2 if abs(N) % abs(M) == 0 else 1
