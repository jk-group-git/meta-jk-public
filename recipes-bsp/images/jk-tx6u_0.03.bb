require recipes-core/images/core-image-minimal.bb

inherit populate_sdk_qt5

LICENSE = "MIT"

IMAGE_FEATURES += "package-management hwcodecs"
EXTRA_IMAGE_FEATURES ?= ""

VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"

IMAGE_INSTALL_append = "\
		packagegroup-core-full-cmdline-multiuser \
		packagegroup-core-full-cmdline-initscripts \
		packagegroup-core-full-cmdline-utils \
		iproute2 \
		iputils \
		module-init-tools \
		at \
		bzip2 \
		cronie \
		gzip \
		less \
		sysfsutils \
		tzdata \
		firmware-imx \
		kernel-modules \
		dhcp-client \
                packagegroup-fsl-gstreamer1.0-full \
                linux-firmware-imx-sdma-imx6q \
                firmware-imx-vpu-imx6d \
                firmware-imx-epdc \
                kernel-modules \
                updater\
                dosfstools\
	"

fstab_add_mmc () {
    cat >> ${IMAGE_ROOTFS}/etc/fstab <<EOF

/dev/mmcblk0p1       /media/sd_card          auto       defaults,nofail,x-systemd.mount-timeout=0 0  0

EOF
}

PACKAGE_CLASSES ?= "package_ipk"

rootfs_add_hashsum_file() {
    # generate checksums
    # application will check against these
    for dir in /bin /usr/bin /lib /usr/lib; do
        find $dir -type f -exec sha256sum {} \; >> /tmp/sha256sums.txt
    done
    sha256sum /tmp/sha256sums.txt > ${IMAGE_ROOTFS}/etc/.checksum
    install /tmp/sha256sums.txt ${DEPLOY_DIR_IMAGE}/checksum.txt
    rm /tmp/sha256sums.txt
}


ROOTFS_POSTPROCESS_COMMAND += "rootfs_add_hashsum_file ; "
ROOTFS_POSTPROCESS_COMMAND += " fstab_add_mmc ;"
