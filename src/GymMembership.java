public class GymMembership {
    public String memberName;
    private double membershipFee;
    private static int totalMembers;

    // setter — user sets the fee from outside
    public void setMembershipFee(double fee) {
        membershipFee = fee;
    }

    // getter — anyone can read the fee
    public double getMembershipFee() {
        return membershipFee;
    }

    // getter — anyone can read total members
    public static int getTotalMembers() {
        return totalMembers;
    }

    // methods that control totalMembers internally
    public void joinGym() {
        totalMembers++;
    }

    private void cancelMembership() {
        totalMembers--;
    }
}