require recipes-bsp/images/jk-tx6u_${PV}.bb

IMAGE_INSTALL_append = "\
		pl161-internal \
		pl161-external \
	"
