# Copyright (C) 2022 Daniel Wagener <daniel.wagener@kernelconcepts.de>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "JK pl-161 telegrambroker"
LICENSE = "CLOSED"
DEPENDS +=  "\
              pl161-displayinterface \
            "

RDEPENDS_${PN} += "\
                   udisks2\
                   updater\
                   dbus\
                  "

PRIORITY = "optional"

inherit bin_package

SRC_URI = "file://pl161-telegrambroker-1.2.12-r0.ipk;subdir=${PN}-${PV}"

PROVIDES="pl161-telegrambroker"
RPROVIDES_${PN}="pl161-telegrambroker"
INSANE_SKIP_${PN} += "already-stripped"
