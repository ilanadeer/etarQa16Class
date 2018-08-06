package qa16.model;

public class GroupData {
    private  String groupName;
    private  String groupHeader;
    private  String groupFooter;

    public GroupData setGroupName(String groupName) {
        this.groupName = groupName;
        return this;

    }

    public GroupData setGroupHeader(String groupHeader) {
        this.groupHeader = groupHeader;
        return  this;
    }

    public GroupData setGroupFooter(String groupFooter) {
        this.groupFooter = groupFooter;
        return  this;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupHeader() {
        return groupHeader;
    }

    public String getGroupFooter() {
        return groupFooter;
    }
}
