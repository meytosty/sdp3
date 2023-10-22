public class NFTAdapter implements NewNFT {
    private LegacyNFT legacyNFT;

    public NFTAdapter(LegacyNFT legacyNFT) {
        this.legacyNFT = legacyNFT;
    }

    public void showNFT() {
        System.out.println("Using the Adapter to show the NFT in the new system.");
        legacyNFT.displayNFT();
    }
}
