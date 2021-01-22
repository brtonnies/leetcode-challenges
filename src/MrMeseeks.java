import java.util.Random;

public class MrMeseeks {
    private Task task;
    private boolean exists;
    private int anger;
    private int howAngry;
    Random gen;

    public MrMeseeks(Task task) {
        this.task = task;
        this.anger = 0;
        this.howAngry = 1;
        this.exists = true;
        this.gen = new Random();

        System.out.println("I'm Mr. Meseeks, look at me!");

        while (!task.completed) {
            solve(task);

            if (task.completed)
                this.stopExisting();
            else {
                MrMeseeks tmp = new MrMeseeks(task);

                this.getMad();
            }
        }
    }

    private void stopExisting() {
        this.exists = !this.exists;
    }

    private void getMad() {
        if (this.howAngry > 0)
            this.anger += this.howAngry * this.anger;
        else
            this.anger++;
    }

    public void solve(Task task) {
        int boob = gen.nextInt(10000);

        task.completed = boob % 6 == 0;

        System.out.println(task.completed ? "I did it!!" : "I failed.... FUCK OFF");
    }


    public static void main(String[] args) {
        MrMeseeks trial = new MrMeseeks(new Task(false));
        System.out.println("I'm dead!");
    }
}
