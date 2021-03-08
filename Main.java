class Tree {
    private String treeName;
    private String treeType;
    private Boolean leavesFall;
    private String leafColor;

    public Tree() {
        this.treeName = "";
        this.treeType = "";
        this.leavesFall = false;
        this.leafColor = "";
    }

    public Tree(String treeName, String treeType, Boolean leavesFall, String leafColor) {
        this.treeName = treeName;
        this.treeType = treeType;
        this.leavesFall = leavesFall;
        this.leafColor = leafColor;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public Boolean getLeavesFall() {
        return leavesFall;
    }

    public void setLeavesFall(Boolean leavesFall) {
        this.leavesFall = leavesFall;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public void print() {
        String str = String.format("This is a %s tree. It is a %s and its leaves are currently %s. It %s lose its leaves for the winner.", treeName, treeType, leafColor, leavesFall ? "does" : "does not");
        System.out.println(str);
    }
}

class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
        Tree tree2 = new Tree("maple", "broadleaf", true, "red");
        tree1.print();
        tree2.print();
        tree1.setTreeName("spruce");
        tree1.setTreeType("conifer");
        tree1.print();
  }
}