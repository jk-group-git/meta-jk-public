# Copyright (C) 2022 Daniel Wagener <daniel.wagener@kernelconcepts.de>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "JK pl-900 gui application"
LICENSE = "CLOSED"
DEPENDS +=  "libpl900ui\
             pl161-displayinterface\
             qtmultimedia\
             libzip\
            "

RDEPENDS_${PN} += "\
                   qtmultimedia-qmlplugins\
                   qtquickcontrols-qmlplugins\
                   qtquickcontrols2-qmlplugins\
                   qtgraphicaleffects-qmlplugins\
                   qtconnectivity\
                   qtsvg\
                   udisks2\
                   updater\
                   pl161-telegrambroker\
                  "

PRIORITY = "optional"

inherit bin_package

SRC_URI = "file://${PN}-${PV}.ipk;subdir=${PN}-${PV}"

PROVIDES="pl900"
RPROVIDES_${PN}="pl900"
INSANE_SKIP_${PN} += "already-stripped"
