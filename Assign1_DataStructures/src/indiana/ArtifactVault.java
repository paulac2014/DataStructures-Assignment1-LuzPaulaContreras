package indiana;

public class ArtifactVault {
    private String[] artifacts;
    private int size;

    public ArtifactVault(int capacity) {
        artifacts = new String[capacity];
        size = 0;
    }

    public void addArtifact(String artifactName) {
        if (size < artifacts.length) {
            artifacts[size] = artifactName;
            size++;
        } else {
            System.out.println("Vault is full.");
        }
    }

    public void removeArtifact(String artifactName) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i] != null && artifacts[i].equals(artifactName)) {
                artifacts[i] = null;
                // Shift all elements to the left after removal
                for (int j = i; j < size - 1; j++) {
                    artifacts[j] = artifacts[j + 1];
                }
                artifacts[size - 1] = null; // Clear the last element
                size--;
                break;
            }
        }
    }

    public int linearSearch(String artifactName) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i] != null && artifacts[i].equals(artifactName)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String artifactName) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (artifacts[mid] == null) {
                return -1;  // Skip null entries if they exist
            }
            int comparison = artifacts[mid].compareTo(artifactName);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}