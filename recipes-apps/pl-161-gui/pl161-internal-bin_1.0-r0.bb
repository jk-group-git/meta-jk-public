# Copyright (C) 2022 Daniel Wagener <daniel.wagener@kernelconcepts.de>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "JK pl-161 gui application systemd unit (internal)"
LICENSE = "CLOSED"
RDEPENDS_${PN} += "\
                   pl161\
                   pl161-udev-rules\
                  "

PRIORITY = "optional"

inherit bin_package

SRC_URI = "file://${PN}-${PV}.ipk;subdir=${PN}-${PV}"

PROVIDES="pl161-internal"
RPROVIDES_${PN}="pl161-internal"
INSANE_SKIP_${PN} += "already-stripped"

inherit systemd
SYSTEMD_SERVICE_${PN} = "pl161-internal.service"
