package ru.netology.domain;

public class Post {
    private int id;
    private int postId;
    private int ownerID;
    private int authorID;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnlyPost;
    private CommentsInfo CommentsInfo;
    private LikesInfo LikesInfo;
    private RepostsInfo RepostsInfo;
    private ViewsInfo ViewsInfo;
    private int countLikes;
    private int countComment;

    public int getSignerID() {
        return signerID;
    }

    public void setSignerID(int signerID) {
        this.signerID = signerID;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    private int countRepost;
    private int countView;
    private int signerID;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnlyPost() {
        return friendsOnlyPost;
    }

    public void setFriendsOnlyPost(int friendsOnlyPost) {
        this.friendsOnlyPost = friendsOnlyPost;
    }

    public CommentsInfo getCommentsInfo() {
        return CommentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        CommentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return LikesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        LikesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return RepostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        RepostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return ViewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        ViewsInfo = viewsInfo;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public int getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(int countRepost) {
        this.countRepost = countRepost;
    }

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }
}
