package com.skillsunion.notification;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationApplication {

	private NotificationService notificationService;

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	/*
	 * TODO:
	 * - Create a @PostConstruct method to be executed after spring container has
	 * completed configuration.
	 * - Invite input using Scanner and System.in for value "to" and "message".
	 * - Set the input to setup(string, string) method in NotificationService.java.
	 * - Invoke send() method in Notification.java.
	 */

	@Autowired
	public NotificationApplication(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@PostConstruct
	private void postConstruct() {
		String userInputTo;
		String userInputMessage;
		Scanner sc = new Scanner(System.in);
		System.out.println("To: ");
		userInputTo = sc.nextLine();
		System.out.println("Message: ");
		userInputMessage = sc.nextLine();
		sc.close();
		notificationService.setup(userInputTo, userInputMessage);
		notificationService.send();
	}

}
