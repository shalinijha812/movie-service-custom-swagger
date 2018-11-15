package com.stackroute.neo4jservice.domain.relation;

import com.stackroute.neo4jservice.domain.nodes.Challenge;
import com.stackroute.neo4jservice.domain.nodes.Concept;
import com.stackroute.neo4jservice.domain.nodes.Language;
import com.stackroute.neo4jservice.domain.nodes.User;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type="isPostedBy")
public class Post {
    @Id
    private String id;
    @Property
    private String name;
    @Property
    private double level;
    @StartNode
    Challenge challenge;
    @EndNode
    User user;

    public Post() {
    }

    public Post(String id, String name, double level, Challenge challenge, User user) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.challenge = challenge;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", challenge=" + challenge +
                ", user=" + user +
                '}';
    }
}
