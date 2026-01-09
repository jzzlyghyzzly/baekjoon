import sys
input = sys.stdin.readline

def palindrome(text: str) -> bool:
    return text == text[::-1]

test_case_count = int(input().strip())

for _ in range(test_case_count):
    word_count = int(input().strip())
    word_list = [input().strip() for _ in range(word_count)]

    palindrome_result = "0"
    for first_index in range(word_count):
        for second_index in range(word_count):
            if first_index == second_index:
                continue

            first_word = word_list[first_index]
            second_word = word_list[second_index]
            combined_word = first_word + second_word

            if palindrome(combined_word):
                palindrome_result = combined_word
                break
        if palindrome_result != "0":
            break

    print(palindrome_result)