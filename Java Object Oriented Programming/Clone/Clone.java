public class Clone {
    public String name = " ";
    public int age = -1;
    private int[] scores =  new int[5];

    public String getInfo(){
        String infoString = "{name: " + this.name + "; age: " + this.age  + "}";
        return infoString;
    }

    public int[] getScores(){
        int[] arr = new int[this.scores.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] =  this.scores[i];
        }
        return arr;
    }

    public void updateAge(int newAge){
        this.age = newAge;
    }

    public boolean isAdult(){
        boolean answer =  false;
        if (this.age >= 18){
            answer =  true;
        }
        return answer;
    }

    public Clone copy(){
        Clone newCopy = new Clone();
        newCopy.name = new String(this.name);
        newCopy.age = this.age;

        return newCopy;
    }
}


