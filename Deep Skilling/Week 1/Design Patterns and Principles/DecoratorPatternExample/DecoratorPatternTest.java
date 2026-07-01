public class DecoratorPatternTest {

    public static void main(String[] args) {

        System.out.println("Email Notification");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Welcome to Cognizant!");

        System.out.println();

        System.out.println("Email + SMS Notification");
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Your OTP is 123456");

        System.out.println();

        System.out.println("Email + SMS + Slack Notification");
        Notifier slackNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()));

        slackNotifier.send("Project deployment completed.");
    }

}