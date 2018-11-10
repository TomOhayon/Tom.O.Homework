package TASKS;


public class Task {
	private int taskDuration;
	private String taskContent;
	public int getTaskDuration() {
		return taskDuration;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskDuration(int taskDuration) {
		this.taskDuration = taskDuration;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	public Task(int taskDuration, String taskContent) {
		super();
		this.taskDuration = taskDuration;
		this.taskContent = taskContent;
	}
	

}
