class UserMainCode(object):
    @classmethod
    def isPalindrome(cls, input1: str) -> int:
        s = input1.lower().replace(" ", "")

        if s == s[::-1]:
            return 1   # Palindrome
        else:
            return 0   # Not palindrome
