class TaskSecond {
    private StringBuilder text = new StringBuilder("Журавли живут амам возле болот, лесных озер, на лугах, берегах речек. " +
            "Гнезда строят прямо на земле! " +
            "Журавель кружит над гнездом, охраняет его амававам? " +
            "В конце лета журавли ам ам собираются в стаи и улетают в теплые страны.");

    void subTaskFirst() {
        StringBuffer strBuf = new StringBuffer();

        char[] array = new char[this.text.length()];

        for (int i = 0; i < this.text.length(); ++i) {
            array[i] = this.text.charAt(i);
        }

        for (int i = 0; i < this.text.length(); ++i) {
            if (array[i] == '!' || array[i] == '?' || array[i] == '.') {
                if (i + 1 < this.text.length())
                    array[i + 1] = '\n';
            }
        }
        System.out.println(array);
    }

    void subTaskSecond() {
        char[] array = new char[this.text.length()];

        for (int i = 0; i < this.text.length(); ++i) {
            array[i] = this.text.charAt(i);
        }

        {
            int index = 0;
            String substr = "";

            while (array[index] != ' ') {
                substr += array[index++];
            }
            substr = substr.toUpperCase();

            this.text.replace(0, index, substr);
        }

        {
            int spaces = 0;
            for (int i = 0; i < this.text.length(); ++i) {
                if (array[i] == ' ')
                    spaces++;
            }
            StringBuilder substr = new StringBuilder();
            int spaceCounter = 0;
            boolean isSave = false;
            int startRecRange = 0;

            for (int i = 0; i < this.text.length(); ++i) {
                if (spaces == spaceCounter) {
                    substr.append(array[i]);

                    if (!isSave) {
                        startRecRange = i;
                        isSave = true;
                    }
                }
                if (array[i] == ' ')
                    spaceCounter++;
            }
            substr = new StringBuilder(substr.toString().toUpperCase());
            this.text.replace(startRecRange, this.text.length(), substr.toString());
        }
        System.out.println(this.text);
    }

    void subTaskThird() {
        int stringCounter = 0;
        for (int i = 0; i < this.text.length(); ++i) {
            char curr = this.text.charAt(i);

            if (curr == '!' || curr == '?' || curr == '.')
                stringCounter++;
        }
        this.text.append(" Колличество предложений в тексте = ").append(stringCounter).append(".");

        System.out.println(this.text);
    }
}
