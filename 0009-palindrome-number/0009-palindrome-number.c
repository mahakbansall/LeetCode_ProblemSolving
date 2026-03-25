#include <stdbool.h>

bool isPalindrome(int x) {
    
    // negative numbers are not palindrome
    if (x < 0) {
        return false;
    }

    int original = x;
    long rev = 0;

    while (x != 0) {
        rev = rev * 10 + (x % 10);
        x = x / 10;
    }

    return rev == original;
}