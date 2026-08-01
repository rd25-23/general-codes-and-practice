#include <stdio.h>
#include <ctype.h>  // for tolower()

int main() {
    char sentence[200];
    int count = 0;
    
    printf("Enter a sentence: ");
    fgets(sentence, sizeof(sentence), stdin);

    for (int i = 0; sentence[i] != '\0'; i++) {
        // Check if this character is the start of a word
        if ((i == 0 || sentence[i-1] == ' ') && isalpha(sentence[i])) {
            char ch = tolower(sentence[i]);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
    }

    printf("Number of words starting with a vowel: %d\n", count);

    // Case when no vowel-starting word
    if(count == 0) {
        printf("There are no words starting with vowels in the sentence.\n");
    }

    return 0;
}
