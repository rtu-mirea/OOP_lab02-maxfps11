package com.company;

class TaskFirst {
    private String text = "Журавли живут амам возле болот, лесных озер, на лугах, берегах речек. " +
            "Гнеда строят прямо на земле! " +
            "Журавель кружит над гнездом, охраняет его амававам? " +
            "В конце лета журавли ам ам собираются в стаи и улетают в теплые страны.";

    //private String substring = "ам";

    void subTaskFirst() {
        char[] array = this.text.toCharArray();

        for (int i = 0; i < this.text.length(); ++i) {
            if (array[i] == '!' || array[i] == '?' || array[i] == '.') {
                if (i + 1 < this.text.length())
                    array[i + 1] = '\n';
            }
        }
        System.out.println(array);
    }

    void subTaskSecond() {
        String[] words = this.text.split(" ");

        words[0] = words[0].toUpperCase();

        int i = 0;
        for (String word : words)
            i++;

        words[i - 1] = words[i - 1].toUpperCase();

        for (String word : words)
            System.out.print(word + " ");
        System.out.println();
    }

    void subTaskThird() {
        String[] words = this.text.split(" ");

        int counter = 0;
        for (String word : words) {
            char[] wordAtArrayChars = word.toCharArray();

            for (int i = 1; i < word.length(); ++i) {
                if (wordAtArrayChars[i - 1] == 'а' && wordAtArrayChars[i] == 'м') {
                    counter++;
                    break;
                }
            }
        }
        System.out.println("Кличество слов содержащих подстроку (ам) = " + counter);
    }

    void subTaskFourth() {
        char[] array = this.text.toCharArray();

        int wordCounter = 1;
        for (int i = 0; i < this.text.length(); ++i) {
            System.out.print(array[i]);

            if (array[i] == ' ')
                wordCounter++;

            if (array[i] == '!' ||
                    array[i] == '?' ||
                    array[i] == '.') {
                System.out.println();
                System.out.println("Колличество слов в предложении = " + wordCounter);
                wordCounter = 0;
            }
        }

    }
}
