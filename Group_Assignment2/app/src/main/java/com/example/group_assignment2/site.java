package com.example.group_assignment2;

public class site {
    private String name;
    private int imageID;
    private String info ;

    public static final site[] sites = {
            new site("Facebook", R.drawable.fb,"is an American online social media and social networking service based in Menlo Park, California and a flagship service of the namesake company Facebook, Inc. It was founded by Mark Zuckerberg, along with fellow Harvard College students and roommates Eduardo Saverin, Andrew McCollum, Dustin Moskovitz and Chris Hughes."),
            new site("Instagram", R.drawable.instegram,"Instagram is an American photo and video-sharing social networking service owned by Facebook, Inc. It was created by Kevin Systrom and Mike Krieger, and launched in October 2010 on iOS"),
            new site("Skype", R.drawable.skype,"Skype is a telecommunications application that specializes in providing video chat and voice calls between computers, tablets, mobile devices, the Xbox One console, and smartwatches over the Internet"),
            new site("Linkedin", R.drawable.linkedin,"is an American business and employment-oriented online service that operates via websites and mobile apps. Launched on May 5, 2003,["),
            new site("Whatsapp", R.drawable.whatsapp,"is an American freeware, cross-platform messaging and Voice over IP (VoIP) service owned by Facebook, Inc.[45] It allows users to send text messages and voice messages."),
            new site("Twiter", R.drawable.twiter,"is an American microblogging and social networking service on which users post and interact with messages known as \"tweets\". Registered users can post, like, and retweet tweets, but unregistered users can only read them.")
};
    public site(){

    }
    private site(String name, int imageID , String info){
        this.name = name;
        this.imageID = imageID;
        this.info = info;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

    public String getInfo() {
        return info;
    }
}
