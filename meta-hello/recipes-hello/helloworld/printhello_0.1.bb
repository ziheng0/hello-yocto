DESCRIPTION = "I am the hello recipe"
PR = "r1"

python do_build() {
    bb.plain("********************");
    bb.plain("*                  *");
    bb.plain("* Hello, World!    *");
    bb.plain("*                  *");
    bb.plain("********************");
}
