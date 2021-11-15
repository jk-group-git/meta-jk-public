# Copyright (C) 2022 Daniel Wagener <daniel.wagener@kernelconcepts.de>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "JK pl-161 telegram communication library"
LICENSE = "CLOSED"
DEPENDS = "qtbase qtserialport pl161crc"

PRIORITY = "optional"

inherit bin_package

SRC_URI = "file://pl161-displayinterface-3.1.0-r0.ipk;subdir=${PN}-${PV}"

PROVIDES="pl161-displayinterface"
RPROVIDES_${PN}="pl161-displayinterface"
INSANE_SKIP_${PN} += "already-stripped"
