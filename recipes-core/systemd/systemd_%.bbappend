do_install_append (){
    rm -f ${D}/etc/systemd/system/getty.target.wants/getty@tty1.service
}

SRC_URI = " \
git://github.com/systemd/systemd.git;protocol=https \
file://touchscreen.rules \
file://00-create-volatile.conf \
file://init \
file://run-ptest \
file://0004-Use-getenv-when-secure-versions-are-not-available.patch \
file://0005-binfmt-Don-t-install-dependency-links-at-install-tim.patch \
file://0007-use-lnr-wrapper-instead-of-looking-for-relative-opti.patch \
file://0010-implment-systemd-sysv-install-for-OE.patch \
file://0011-nss-mymachines-Build-conditionally-when-HAVE_MYHOSTN.patch \
file://0012-rules-whitelist-hd-devices.patch \
file://0013-Make-root-s-home-directory-configurable.patch \
file://0014-Revert-rules-remove-firmware-loading-rules.patch \
file://0015-Revert-udev-remove-userspace-firmware-loading-suppor.patch \
file://0017-remove-duplicate-include-uchar.h.patch \
file://0018-check-for-uchar.h-in-configure.patch \
file://0019-socket-util-don-t-fail-if-libc-doesn-t-support-IDN.patch \
file://0001-add-fallback-parse_printf_format-implementation.patch \
file://0002-src-basic-missing.h-check-for-missing-strndupa.patch \
file://0003-don-t-fail-if-GLOB_BRACE-and-GLOB_ALTDIRFUNC-is-not-.patch \
file://0004-src-basic-missing.h-check-for-missing-__compar_fn_t-.patch \
file://0006-Include-netinet-if_ether.h.patch \
file://0007-check-for-missing-canonicalize_file_name.patch \
file://0008-Do-not-enable-nss-tests.patch \
file://0009-test-hexdecoct.c-Include-missing.h-form-strndupa.patch \
file://0010-test-sizeof.c-Disable-tests-for-missing-typedefs-in-.patch \
file://0011-don-t-use-glibc-specific-qsort_r.patch \
file://0012-don-t-pass-AT_SYMLINK_NOFOLLOW-flag-to-faccessat.patch \
file://0013-comparison_fn_t-is-glibc-specific-use-raw-signature-.patch \
file://0001-Define-_PATH_WTMPX-and-_PATH_UTMPX-if-not-defined.patch \
file://0001-Use-uintmax_t-for-handling-rlim_t.patch \
file://0001-core-evaluate-presets-after-generators-have-run-6526.patch \
file://0001-main-skip-many-initialization-steps-when-running-in-.patch \
"
