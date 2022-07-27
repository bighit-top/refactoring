package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method;

public class ParticipantDashboard extends Dashboard {
/*//    public void printParticipants(int eventId) throws IOException {
//        // Get github issue to check homework
//        GitHub gitHub = GitHub.connect();
//        GHRepository repository = gitHub.getRepository("whiteship/live-study");
//        GHIssue issue = repository.getIssue(eventId);
//
//        // Get participants
//        Set<String> participants = new HashSet<>();
//        issue.getComments().forEach(c -> participants.add(c.getUserName()));
//
//        // Print participants
//        participants.forEach(System.out::println);
//    }

    public void printUsernames(int eventId) throws IOException {
        // Get github issue to check homework
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);

        // Get usernames
        Set<String> usernames = new HashSet<>();
        issue.getComments().forEach(c -> usernames.add(c.getUserName()));

        // Print usernames
        usernames.forEach(System.out::println);
    }*/

}
