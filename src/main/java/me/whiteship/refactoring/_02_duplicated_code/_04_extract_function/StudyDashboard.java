package me.whiteship.refactoring._02_duplicated_code._04_extract_function;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudyDashboard {

    private void printParticipants(int eventId) throws IOException {
        // Get github issue to check homework
//        GitHub gitHub = GitHub.connect();
//        GHRepository repository = gitHub.getRepository("whiteship/live-study");
//        GHIssue issue = repository.getIssue(eventId);
        GHIssue issue = getGhIssue(eventId);

        // Get participants
//        Set<String> participants = new HashSet<>();
//        issue.getComments().forEach(c -> participants.add(c.getUserName()));
        Set<String> participants = getUsernames(issue);

        // Print participants
//        participants.forEach(System.out::println);
        print(participants);
    }

    private void printReviewers() throws IOException {
        // Get github issue to check reviews
//        GitHub gitHub = GitHub.connect();
//        GHRepository repository = gitHub.getRepository("whiteship/live-study");
//        GHIssue issue = repository.getIssue(30);
        GHIssue issue = getGhIssue(30);

        // Get reviewers
//        Set<String> reviewers = new HashSet<>();
//        issue.getComments().forEach(c -> reviewers.add(c.getUserName()));
        Set<String> reviewers = getUsernames(issue);

        // Print reviewers
//        reviewers.forEach(System.out::println);
        print(reviewers);
    }

    private void print(Set<String> participants) {
        participants.forEach(System.out::println);
    }

    private Set<String> getUsernames(GHIssue issue) throws IOException {
        Set<String> usernames = new HashSet<>();
        issue.getComments().forEach(c -> usernames.add(c.getUserName()));
        return usernames;
    }

    private GHIssue getGhIssue(int eventId) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);
        return issue;
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.printReviewers();
        studyDashboard.printParticipants(15);
    }

}
