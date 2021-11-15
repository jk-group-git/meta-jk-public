# Copyright (C) 2022 Daniel Wagener <daniel.wagener@kernelconcepts.de>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "CRC16 checksum for pl161"
LICENSE = "CLOSED"
DEPENDS = "qtbase"

PRIORITY = "optional"

inherit bin_package

SRC_URI = "file://pl161-crc1-1.1.0-r0.ipk;subdir=${PN}-${PV}"

PROVIDES="pl161crc"
RPROVIDES_${PN}="pl161crc"
INSANE_SKIP_${PN} += "already-stripped"
