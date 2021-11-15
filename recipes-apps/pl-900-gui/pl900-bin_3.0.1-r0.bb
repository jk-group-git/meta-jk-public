# Copyright (C) 2022 Daniel Wagener <daniel.wagener@kernelconcepts.de>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "JK pl-900 gui application library"
LICENSE = "CLOSED"
DEPENDS = "qtbase"
RDEPENDS_${PN} += "qtbase"

PRIORITY = "optional"

inherit bin_package

SRC_URI = "file://${PN}-${PV}.ipk;subdir=${PN}-${PV}"

PROVIDES="libpl900ui"
RPROVIDES_${PN}="libpl900ui"
INSANE_SKIP_${PN} += "already-stripped"
