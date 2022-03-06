package ru.netology.ak1;

public class Worker {

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskFailedListener {
        void onFailed(String result);
    }

    private OnTaskDoneListener callback;
    private OnTaskFailedListener failedCallback;

    public Worker(OnTaskDoneListener callback, OnTaskFailedListener failedCallback) {
        this.callback = callback;
        this.failedCallback = failedCallback;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i == 33) {
                failedCallback.onFailed("Task # " + i + " is failed");
            } else {
                callback.onDone("Task # " + i + " is done");
            }
        }
    }
}
