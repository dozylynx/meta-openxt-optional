DESCRIPTION = "QT-based JSON library"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/QtMark/qmjson.git;protocol=git;branch=master \
           file://no-gui.patch;patch=1"

SRCREV = "c503e3a1f77b782814aa929d4ecd7aa2d1ce1c2d"

S = "${WORKDIR}/git"
PV = "1.0+git${SRCPV}"

inherit qmake5

DEPENDS = "qtbase"

EXTRA_OEMAKE += "INSTALL_ROOT=${D}"

PR="r1"
