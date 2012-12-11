package io.rko.uzh.exprep01.version;


/**
 * Contains version information for the package uzh-exam-preps-01.
 *
 * @author auto-generated
 * @version 0.1.0
 */
public final class PackageVersion {

    /** The name of the package (Stark Enterprises). */
    private static final String mPackageName = "Stark Enterprises";

    /** The version of the package (0.1.0). */
    private static final String mVersion     = "0.1.0";

    /** The build date of the package (11.12.2012 23:38:26). */
    private static final String mBuildDate   = "11.12.2012 23:38:26";


    /**
     * Gets the package name.
     *
     * @return String The package name.
     */
    public static String getPackageName() {
        return mPackageName;
    }

    /**
     * Gets the package version.
     *
     * @return String The package version.
     */
    public static String getPackageVersion() {
        return mPackageName + " V" + mVersion + " [" + mBuildDate + "]";
    }

    /**
     * Gets the version.
     *
     * @return String The version.
     */
    public static String getVersion() {
        return mVersion;
    }

    /**
     * Gets the build date.
     *
     * @return String The build date.
     */
    public static String getBuildDate() {
        return mBuildDate;
    }

}
