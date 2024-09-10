package ThirdMonth.MainLessons.Lesson19.Task1;

public class StringBufferExample extends Thread {

    StringBuffer buffer;
    String text;

    public StringBufferExample(StringBuffer buffer, String text) {
        this.buffer = buffer;
        this.text = text;
    }

    @Override
    public void run() {
            buffer.append(text);
    }
}
