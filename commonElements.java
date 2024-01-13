static int[] f(int[] first, int[] second) {
        int[] common = new int [0];
        for(int num1: first) {
            for(int num2: second) {
                if(num1 == num2) {
                    int[] newArray = new int [common.length+1];
                    for(int i = 0; i < common.length; i++) {
                        newArray[i] = common[i];
                    }
                    newArray[common.length] = num1;
                    common = newArray;
                    break;
                }
            }
        }
        return common;
}

